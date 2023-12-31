# Project Koopa (WIP)
It is very barebones right now. Features will be slowly added.

## Getting started

Note: The production and test environment will most likely be the same. The test environment will use a separate database for testing.

Production URL: http://koopa.us-east-2.elasticbeanstalk.com/

Test Env URL: http://testkoopa.us-east-2.elasticbeanstalk.com/

Each time a pull request is approved and merged, it will trigger the CI/CD pipeline. The pipeline will test, package, and deploy the code.

---

## Design

**Code Architecture:**

Microservices with a Monorepository

Current services:

-   React Server ("frontend", "port 3000", "Will be refactored soon")
-   Apollo GraphQL Server ("middleware query resolver", "not set up yet")
-   Java Spring Server ("backend", "port 5000")
    -   Java HelloModule GraphQL API Service
    -   Java HelloModule REST API Service ("/hello")
-   More to come!

**Project Structure:**

A certain structure is enforced by Maven + Modulith

**Java Module Information**

Every module will communicate to its dependent services via HTTP using WebClient. WebClient is a reactive and non-blocking solution. Reactive programming is a programming paradigm where the focus is on developing asynchronous and non-blocking components. The core of reactive programming is a data stream that we can observe and react to, and even apply back pressure to as well. This leads to non-blocking execution, and better scalability with fewer threads of execution.

https://www.baeldung.com/java-reactive-systems

**Java Module blueprint:**

-   Internal (interface + concrete implementation)

    1.  Controller (Exposes REST or GraphQL endpoints and implements both External and Internal API)
    2.  Service (Business logic to serve to controller)
    3.  Mapper (Maps External DTO to Bean)
    4.  Repository (Collections of many different DAO's or a particular DAO)
    5.  DAO (Communicate directly with database)
    6.  Bean (Java representation of database object)

-   External

    1.  External API (Methods that are exposed to the public so anyone can use)
    2.  Internal API (Methods that are exposed to other internal modules)
    3.  DTO (Each DTO can fully or partially be an internal Bean)

-   JUnit Tests
    1.  Unit tests
    2.  Integration tests (WebTestClient)
    3.  End to end and single API tests (WebTestClient)

**Spring Dependencies:**

1. Webflux (Asynchronous + functional programming)
2. Modulith
3. GraphQL
4. Lombok

**React:**

Can be found in /web/src/main/frontend

Go to command prompt, cd into dir, and execute "npm start" to launch frontend service for development purposes

Unit testing: Jest

Integration testing: Jest

E2E testing: Playwright

# IGNORE THE REST OF THE BELOW (I'm keeping it for notes)

---

## Description

Let people know what your project can do specifically. Provide context and add a link to any reference visitors might be unfamiliar with. A list of Features or a Background subsection can also be added here. If there are alternatives to your project, this is a good place to list differentiating factors.

## Badges

On some READMEs, you may see small images that convey metadata, such as whether or not all the tests are passing for the project. You can use Shields to add some to your README. Many services also have instructions for adding a badge.

## Visuals

Depending on what you are making, it can be a good idea to include screenshots or even a video (you'll frequently see GIFs rather than actual videos). Tools like ttygif can help, but check out Asciinema for a more sophisticated method.

## Installation

Within a particular ecosystem, there may be a common way of installing things, such as using Yarn, NuGet, or Homebrew. However, consider the possibility that whoever is reading your README is a novice and would like more guidance. Listing specific steps helps remove ambiguity and gets people to using your project as quickly as possible. If it only runs in a specific context like a particular programming language version or operating system or has dependencies that have to be installed manually, also add a Requirements subsection.

## Usage

Use examples liberally, and show the expected output if you can. It's helpful to have inline the smallest example of usage that you can demonstrate, while providing links to more sophisticated examples if they are too long to reasonably include in the README.

## Support

Tell people where they can go to for help. It can be any combination of an issue tracker, a chat room, an email address, etc.

## Roadmap

If you have ideas for releases in the future, it is a good idea to list them in the README.

## Contributing

State if you are open to contributions and what your requirements are for accepting them.

For people who want to make changes to your project, it's helpful to have some documentation on how to get started. Perhaps there is a script that they should run or some environment variables that they need to set. Make these steps explicit. These instructions could also be useful to your future self.

You can also document commands to lint the code or run tests. These steps help to ensure high code quality and reduce the likelihood that the changes inadvertently break something. Having instructions for running tests is especially helpful if it requires external setup, such as starting a Selenium server for testing in a browser.

## Authors and acknowledgment

Show your appreciation to those who have contributed to the project.

## License

For open source projects, say how it is licensed.
