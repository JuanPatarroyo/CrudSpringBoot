# CrudSpringBoot 👨‍💻

## About app 🎯

I use springboot and hibernate to do a CRUD. This application implements a crud to a table of person. You could found Crud operations in this project, an about the technologies this application uses:
- Java (Springboot)
- JPA (Java Persistence Api)
- Spring security
- Thymeleaf

## Preview 📸

### Login View
![Login View](https://github.com/JuanPatarroyo/CrudSpringBoot/blob/main/img/Preview_1.png?raw=true)
### Main View
![Main View](https://github.com/JuanPatarroyo/CrudSpringBoot/blob/main/img/Preview_2.png?raw=true)
### Insert new row
![Insert new row](https://github.com/JuanPatarroyo/CrudSpringBoot/blob/main/img/Preview_3.png?raw=true)
### Update/Delete row
![Update/Delete row](https://github.com/JuanPatarroyo/CrudSpringBoot/blob/main/img/Preview_4.png?raw=true)

## Requirements 💻

- You need to create a persistence called "SgaPU" and a datasource "jdbc/PersonaDb", or just change their names in the file persistence.xml
- Create three tables: user_control, Persona and Usuario,
  - User_control has: id_user, username, password
  - Persona has: id_persona, nombre, apellido, email, telefono, segundo_apellido, saldo
  - Usuario has: id_usuario, id_persona, username, password
- you could change the way to connect to the database, but remember the project works with JPA.

*Feel you free to use it* 🤓.
