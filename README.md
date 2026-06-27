# Smart Residential Compound Management System

This project is a Java-based management system designed to simulate operations inside a residential compound. The system supports three main user roles: Resident, Admin, and Technician. Each role has specific responsibilities and permissions within the system.

## Classes Description

### User Class

The `User` class is the parent (superclass) for all system users. It stores common user information such as:

* Name
* Phone Number
* Email
* Password
* ID

This class provides the basic structure shared by Resident, Admin, and Technician.

### Resident Class

The `Resident` class represents people living in the compound and extends the `User` class.

Responsibilities:

* Enter and validate personal details
* Submit maintenance/service requests
* Make facility bookings
* View notifications related to compound services

Attributes:

* Resident Name
* Apartment Number
* Resident Email

### Admin Class

The `Admin` class represents the compound administrator and extends the `User` class.

Responsibilities:

* Manage residents and users
* Track submitted reports and requests
* Generate system reports
* Monitor overall system activity

Admin controls major system operations and manages compound data.

### Technician Class

The `Technician` class represents maintenance staff responsible for solving technical issues.

Responsibilities:

* Handle resident requests
* Provide maintenance services
* Select and work based on specialization

Attributes:

* Specialization
* Availability Status

Supported specializations include:

* Electricity
* Plumbing
* Air Conditioning
* Network
* Security Systems

### Main Class

The `Main` class is the entry point of the application.

Responsibilities:

* Display the system menu
* Allow role selection (Resident / Admin / Technician)
* Handle user input
* Control program flow using loops and switch cases

## Features

* Role-based access control
* Input validation
* Email-based security verification
* Request submission and report generation
* Continuous menu-driven interaction
