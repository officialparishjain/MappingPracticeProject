# Project Name
Mapping Practice Project

# Frameworks and Language Used
**Spring Boot** 2.1.0
**Java** 20.0
**Maven** 3.8.1

# Data Flow
The following functions are used in the data flow of this project:

## Models: 

Summary of the provided entity classes:

**Address:**

Represents an address entity.
Contains fields such as addressId, landmark, zipcode, district, state, and country.
Has a one-to-one unidirectional mapping with Student.

**Book:**

Represents a book entity.
Contains fields such as bookID, bookTitle, bookAuthor, bookDescription, and bookPrice.
Has a many-to-one mapping with Student, indicating that multiple books can be issued to a single student.

**Course:**

Represents a course entity.
Contains fields such as courseID, courseTitle, courseDescription, and courseDuration.
Has a many-to-many mapping with Student, indicating that multiple students can take multiple courses.

**Laptop:**

Represents a laptop entity.
Contains fields such as laptopID, laptopName, laptopBrand, and laptopPrice.
Has a one-to-one mapping with Student, indicating that a laptop can be associated with only one student.

**Student:**

Represents a student entity.
Contains fields such as studentID, studentName, studentAge, studentPhoneNumber, studentBranch, and studentDepartment.
Has a one-to-one mapping with Address, indicating that each student has a unique address.
Also has mappings with Book, Course, and Laptop entities to establish relationships.
These entity classes define the structure and relationships between different entities within the application.

## Controller:

**AddressController:**

Contains endpoints for adding and deleting addresses.
addAddress method accepts a POST request with an Address object and adds the address using the AddressService.
deleteAddressById method accepts a DELETE request with an address ID and deletes the address using the AddressService.

**BookController:**

Provides endpoints for managing books.
addBook method accepts a POST request with a Book object and adds the book using the BookService.
getAllBooks method returns a list of all books using the BookService.
deleteBookById method accepts a DELETE request with a book ID and deletes the book using the BookService.

**CourseController:**

Manages courses.
addCourse method accepts a POST request with a Course object and adds the course using the CourseService.
getAllCourse method returns a list of all courses using the CourseService.

**LaptopController:**

Handles laptops.
addLaptop method accepts a POST request with a Laptop object and adds the laptop using the LaptopService.
getALlLaptops method returns a list of all laptops using the LaptopService.
updateLaptopPrice method accepts a PUT request with a laptop ID and a new price, updating the laptop's price using the LaptopService.

**StudentController:**

Manages students.
addStudent method accepts a POST request with a Student object and adds the student using the StudentService.
getStudentList method returns a list of all students using the StudentService.
deleteStudentById method accepts a DELETE request with a student ID and deletes the student using the StudentService.
These controllers provide endpoints for performing CRUD operations on different entities within the application, such as addresses, books, courses, laptops, and students.

## Services

Summary of the provided services:

**AddressService:**

Provides methods for adding and deleting addresses.
addAddress method saves the address using the IAddressRepo.
deleteAddressById method deletes the address by ID using the IAddressRepo.

**BookService:**

Manages book-related operations.
addBook method adds a book by setting the associated student and saving it using the IBookRepo and StudentService.
getAllBookList method retrieves a list of all books using the IBookRepo.
deleteBookById method deletes a book by ID using the IBookRepo.

**CourseService:**

Handles course-related operations.
addCourse method saves a course using the ICourseRepo.
getAllCourse method retrieves a list of all courses using the ICourseRepo.

**LaptopService:**

Manages laptop-related operations.
addLaptop method adds a laptop by saving it using the ILaptopRepo.
getAllLaptops method retrieves a list of all laptops using the ILaptopRepo.
updateLaptopPrice method updates the price of a laptop by ID using the ILaptopRepo.


**StudentService:**

Handles student-related operations.
addStudent method saves a student using the IStudentRepo.
getAllStudent method retrieves a list of all students using the IStudentRepo.
deleteById method deletes a student by ID using the IStudentRepo.
getStudentById method retrieves a student by ID using the IStudentRepo.
These services provide the business logic for manipulating and managing different entities within the application, such as addresses, books, courses, laptops, and students.

_**Repository:**_ The repository layer is responsible for interacting with the database. It uses Spring Data JPA to perform CRUD (create, read, update, delete) operations on entities.


# Database Structure Used
I have used MySql as Database.

# Project Summary

This is an ecommerce application that allow user to place order and having differnt fetures also



