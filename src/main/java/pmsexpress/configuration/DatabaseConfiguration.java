package pmsexpress.configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientOptions.Builder;
import com.mongodb.MongoCredential;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@EnableMongoRepositories("pmsexpress.repositories")
public class DatabaseConfiguration extends AbstractMongoConfiguration {

  @Value("${spring.data.mongodb.database}")
  private String database;

  @Value("${spring.data.mongodb.host}")
  private String host;

  @Value("${spring.data.mongodb.password}")
  private String password;

  @Value("${spring.data.mongodb.port}")
  private Integer port;

  @Value("${spring.data.mongodb.username}")
  private String username;

  @Value("${spring.data.mongodb.authentication-database:}")
  private String authenticationDatabase;

  @Value("${connection-pool:}")
  private int connectionPool;

  @Override
  public String getDatabaseName() {
    return database;
  }

  @Override
  @Bean
  public MongoClient mongoClient() {
    List<ServerAddress> seeds = new ArrayList<>();
    String[] servers = host.split(",");
    for (String ip : servers) {
      seeds.add(new ServerAddress(ip.trim(), port));
    }
    Builder builder = new MongoClientOptions.Builder();
    MongoClientOptions options = builder.connectionsPerHost(connectionPool)
        .minConnectionsPerHost(10) // preinit connection pool
        .readPreference(ReadPreference.secondaryPreferred()).build();
    if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)) {
      MongoCredential cred = MongoCredential.createCredential(username, authenticationDatabase, password.toCharArray());
      return new MongoClient(seeds, cred, options);
    } else {
      return new MongoClient(seeds, options);
    }
  }

  @Bean
  public ValidatingMongoEventListener validatingMongoEventListener() {
    return new ValidatingMongoEventListener(validator());
  }

  @Bean
  public LocalValidatorFactoryBean validator() {
    return new LocalValidatorFactoryBean();
  }

}