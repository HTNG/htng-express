<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![? License][license-shield]][license-url]
<!-- [![LinkedIn][linkedin-shield]][linkedin-url] -->

# HTNG Express

HTNG Express PMS Integration Spec. V1.0
logoThe HTNG Express PMS Integrations Specification is built specifically for integrations with property management systems (PMS) that need a limited set of data enabling an expedited integration experience.

This specification reduces resources needed for lighter weight implementations and provides property management systems with a streamlined integration process, allowing the industry to align on a single standardized method. This specification supports integrations requiring Reservation, Guest and Room information.

The specification does not support integrations that require a full data set such as those between a Central Reservation System (CRS) and a PMS. Implementations of that nature should continue to utilize the appropriate HTNG and OpenTravel messages.

## Document Purpose
For Hotels, currently the PMS serves as the primary interface for Guest, Reservation, Folio, and Room data. Because of this, any system that interacts with any of these entities requires an integration to be effective.

Not all integrations are created equal. Integrations that require only a subset of the functionality of the PMS go through the same process as distribution channels. This process is quite intensive in many cases and takes significant resources from both the PMS as well as the vendor. This causes a number of friction points for all stake holders, listed below. Early integration standards with HTNG were focused on distributing room inventory, connecting a PMS with OTAs, CRS, GDS, Website, CRM, etc. This was a very comprehensive spec and focused on deep integrations between a PMS and downstream systems. Most of these complexities were necessary to achieve integrations for systems such as the CRS for a booking use case.

The current landscape of technology has moved heavily into post-booking. These systems include technologies from Messaging, Wi-Fi, Guest Services, Housekeeping, and many more. These technologies still require integration with the PMS, but unlike their Booking counterparts, the need for PMS integration is limited in scope. In general, Vendors need to learn basic information about who is in the room, understand the state of the room, and potentially post charges.

Although the needs for integration for post-booking operations systems differ, they are currently still following the same path. The result is that timelines are extensive for very basic needs, and innovation is stifled for the industry. Every stakeholder is impacted negatively in the current state:

### For the Vendor

• Projects take longer and are less predictable, delayed revenue

• A lot of rework needs to happen when specs are wrong

• New integrations take time to write, wasted internal resources

### For the Hotels

• Projects get delayed

• PMs and other relationship managers sit in the middle of a PMS/Vendor

• Lots of interactions create friction in the Hotel-PMS and Hotel-Vendor relationship For the PMS

• The number of Integrations that happen per year are lower, delayed revenue

• Unnecessary resources to manage the bespoke process

## Scope
By adding constraints on what information is accessible and what capabilities are available we simplify the end-to-end integration process for all parties involved, however this specification will not fit all vendor’s needs. This specification will have

• Limited data fields available

• Limited capabilities available

• Clear process/docs to request integrations

## Relationship to Other Standards
This specification and its supporting schemas leverage the existing OpenTravel Alliance methodology for message construction and draws upon data definitions common to several HTNG specifications as of November 1, 2022 Related specifications:

• Folio Detail

• Single Guest Itinerary

• Guest Room Status Messaging

• Intelligent Guest Room

## Useful Resources
HTNG Express Sandbox

## Additional Documentation

## Audience
This document is useful for anyone wanting to implement the HTNG Express PMS APIs including but not limited to project managers, developers, and integrators.

## Overview
This document contains examples of vendor categories that will likely be able to utilize the APIs either to meet their needs fully or partially. It also contains the specific data fields for each of the entities including the data types, optionality, and occurrences for each field. And among other useful information, included is detailed information about how the data fields are used in various PMS system which provides great insight and visibility into when and what questions need to be asked for specific implementation needs.

## Known Limitations
This specification is not intended to support full scale PMS integrations. It focuses on post-booking and operational use cases. This allows systems who require a limited set of data, specifically those data fields outlined in this document, to integrate easily. For instance, the check-in process will not be supported by the first version of this spec since it requires a significant portion of the booking functionality to work.

This spec is intended to be iterated on and we plan to expand use cases in the future to include additional data fields and capabilities. If there is a use case that meets our core principles, the work group welcomes a conversation for future inclusion.

The HTNG Express spec was created by an industry work group of vendors that intend to use the spec, and PMS systems that intend to support it. The spec will focus on a subset of post-booking use cases first, in areas where there is highest level of alignment. The spec follows a few principles:

Start with focus, but iterate into broader use cases over time
Keep the specification as simple as possible, but no simpler
Provide deep context, so that non-hotel technologists can ramp quickly
Make adoption by the PMS simple
Build momentum

<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple steps.

1. Clone the repo
   ```sh
   git clone https://github.com/HTNG/htng-express.git
   ```

<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/HTNG/htng-express/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- LICENSE -->
## License

Distributed under the ? License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Slack - [HTNG Members](https://htngmembers.slack.com) - #expresspms

Project Link: [ExpressPMS-Workgroup](https://www.htng.org/general/custom.asp?page=ExpressPMS-Workgroup)


<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements

Please see https://htng.stoplight.io/docs/htng-express-pms-integrations/4d68437c69796-contributors for a comprehensive list of current contributors




<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/HTNG/htng-express.svg?style=for-the-badge
[contributors-url]: https://github.com/HTNG/htng-express/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/HTNG/htng-express.svg?style=for-the-badge
[forks-url]: https://github.com/HTNG/htng-express/network/members
[stars-shield]: https://img.shields.io/github/stars/HTNG/htng-express.svg?style=for-the-badge
[stars-url]: https://github.com/HTNG/htng-express/stargazers
[issues-shield]: https://img.shields.io/github/issues/HTNG/htng-express.svg?style=for-the-badge
[issues-url]: https://github.com/HTNG/htng-express/issues
[license-shield]: https://img.shields.io/github/license/HTNG/htng-express.svg?style=for-the-badge
[license-url]: https://github.com/HTNG/htng-express/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/HTNG
