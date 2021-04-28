# Major/Minor/Patch Definitions
* A Major release is defined as any Schema Breaking change (or where there is a business decision that enough Minor releases have been performed). This is primarily centred around major changes to the public facing document (API) where the customer will need to make changes to their systems in order to make further use of the API.

* A Minor release is defined as any Non Schema Breaking change. This can include deprecation or addition of interaction objects (endpoints) and fields. The customer may or may not implement these changes, but it will not affect their business if they ignore them. 

* A Patch release is defined as a bug fix to a Minor release. This may include fixing spelling mistakes, or internal issues. If there is no change to the API or document, there is no need for customer communications other than in the event of notification of resolution if the bug was raised by a customer.

# Version Naming Convention
Release versions will use the Major-Minor-Patch naming convention.

Documents that are being updated as part of a release will use the Major-Minor-Patch-Build naming convention.

The Major-Minor-Patch part of the document version must be the same as the release version.

The Build part of the document version must be a unique number for each time that the document is built.

For example: htng-express-pms:2.0.1-123

# Major release considerations
* A major release will be flagged as a Long Term Support release (LTS)
* LTS releases must be supported for at least 1 year.
* Users (Customers) must be informed of a major release 90 days prior to release date
* The major release must not include any new functionality that was not in a previous minor release.
* The major release can include the removal of fields that were flagged as deprecated in a previous minor release.
* The major release can include mandatory fields that were optional in a previous minor release (as long as they were flagged that they would be made mandatory)
* The major release must be available as pre-release 90 days prior to being marked as the de facto standard for early adoption and customer testing.

Once a major release has been announced, no new minor release can be added to the previous major version (patch releases are accepted)

Minor releases can start on the new major release from the date of release announcement.

There is no minimum or maximum caps on how many major or minor releases are performed (however, due to the LTS need to support Major releases for a year, this should be kept at a manageable level)

# Deprecation of fields, methods, and endpoints
Deprecation will follow a similar strategy, where methods will be marked as deprecated for a period of no less than 30 days before removal. Most deprecated items will only be removed in Major (LTS) releases, giving client development teams ample time for implementing change.

Client facing API documentation (OpenAPIv3, and API documents) should reflect these deprecations immediately on release and communications should go out to clients via the client liaison, that certain features or methods have been marked as deprecated.
