# TestAssignmentTurtle

The application is designed mostly based on Command Pattern.Each Instruction is implemented as command.

The application support 2 mode of execution,
    1. Console 
    2. File
Currently, the program executes only console mode, but new Excutor can be implemetented to provide both option to the user and user can select any particular option.


**Following are few important components:**  
**Game Class** - Initializes and manage the application.
**GameContext Class** - Holds the current context.
**AbstractTurtle Class** - Is the base class for turtle, it contains basic functionality.
