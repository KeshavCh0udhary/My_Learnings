let Students = []

class User {
    #password
    constructor(name, id) {
        this.name = name;
        this.id = id;
    };

    SignUp(username, password) {
        //Validation of userename and password;
        let IsValidated = false;

        // Validating username and password;

        IsValidated = this.#ValidateUserName(username) && this.#ValidatePasword(password);

        if (IsValidated) {
            this.username = username;
            this.#password = password;
            console.log("Validation Successful");
            Students.push(this);
            // return true;
        } else {
            console.log("Please follow the instructions");
        };
    };
    //encapsulation
    #ValidateUserName(username) {
        //checking for rules;
        return true;
    };
    //encapsulation
    #ValidatePasword(password) {
        //checking for password
        return true;
    };

    login(username, password) {
        if (username === this.username && password === this.#password) {
            console.log("Login Successful");
        } else {
            console.log("Invalid credentials");
        };
    };
};

let S1 = new User("Keshav", 2);
let S2 = new User("Krishna", 7);
S1.SignUp("Keshav", "Keshav@");
S2.SignUp("Krishna", "Krishna@");

S1.login("Keshav", "Keshav@");
S2.login("Krishna", "Krishna@");

//console.log(S1, S2);


class Student extends User {

    constructor(name, id) {
        super(name, id);
        this.numOfAssignments = 0;
    };

    SubmitAssignment() {
        this.numOfAssignments++;
    }
}

class Admin extends User {

    constructor(name, id) {
        super(name, id);
    };

    removeStudent(id) {
        Students=Students.filter((el) => {
            return el.id !== id;
        });
    };

};


let Student1 = new Student("Keshav", 7);
Student1.SignUp("Keshav", "KesHav@");
Student1.login("Keshav", "KesHav@");
// console.log(Student1);
// console.log(Students);

let Admi = new Admin("Nrupul", 7);

Admin.removeStudent(7);

console.log(Students);