<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a id="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->



<!-- PROJECT LOGO -->
<br />
<div align="center">

  <h3 align="center">README</h3>

</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project


Hello!

I knew I wanted to build this with Spring Boot because I'm most familiar with Java honestly but I haven't specifically worked with this framework before. For the database I figured noSql would be the most simple. I was going to use Firebase but just decided to try MongoDB instead. For the public apis I Googled a different site with a cat api which also happened to have a dog api, no bears unfortunately. I initially wanted to use these endpoints because they advertised a parameter to get multiple images but turns out their limit parameter does not work right! So it is a single call per image.

Thanks :)


<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white)](https://www.mongodb.com/)
[![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started


### Prerequisites

You'll need Docker to run this application if you don't already have.

1. Go to the official Docker page: https://www.docker.com/get-started
2. Install according to your OS
3. Follow installation steps, most likely will need to restart, do that if prompted
4. Open a terminal on your machine and run these just to verify
  ```sh
 docker --version
 docker compose version
  ```

### Installation

Clone and go

1. Open a terminal on your machine and navigate to the directory where you want to clone the repo
   ```sh
   cd chosen/path/example
   ```
3. Clone the repo
   ```sh
   git clone https://github.com/lizstevens/image-service.git
   ```
5. Navigate to the project
   ```sh
   cd image-service
   ```
6. Spin up Spring Boot, MongoDB, and run automated tests
   ```sh
   docker compose up --build
   ```
7. Open a browser and navigate to http://localhost:8080/
8. You should see the prompt page

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- USAGE EXAMPLES -->
## Usage

To Fetch and save random images of cats or dogs select either cat or dog.
Enter how many using the arrows in the box prompt.
Press submit.
The images saved will display from left to right in the order saved.

To get the latest saved image press Get Latest Saved.
The latest saved image will display.

<p align="right">(<a href="#readme-top">back to top</a>)</p>
