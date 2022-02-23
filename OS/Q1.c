// 1. Implement the C Program to create a child process using fork (), display
// parent and child process id. Child process will display the message “I am
// Child Process” and the parent process should display “I am Parent
// Process”.

#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main()
{

    int pid = fork(); // I have just created new process using fork
    if (pid > 0) {
        printf("I am Parent process\n");
        printf("ID : %d\n\n", getpid()); //for parent process
    }
    else if (pid == 0) {
        printf("I am Child process\n");

        printf("ID: %d\n", getpid()); //for child process

    }
    else {
        printf("Failed to create child process");
    }

    return 0;
}
