#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
int main()
{
  int ch_nice, par_nice; // ch_nice -to store priority of child process ..... and par_child is to store priority of parent process
  pid_t pid;
  pid = fork(); // created new process using fork

  if (pid == 0) // for child process
  {
    printf("i am child process:");
    printf("\nId for child process: %d", getpid()); // i have written getpid() to get id for child process
    ch_nice = nice(-13);
    printf("\nChild process has priority : %d", ch_nice);
  }

  else if (pid > 0) // for parent process
  {
    printf("i am parent process:");
    printf("\nId for parent process: %d", getpid()); // same here getpid() but for parent process
    par_nice = nice(15);
    printf("\nparent process has priority : %d", par_nice);
  }
  else
  {
    printf("\n fork() failed...");
  }

  return 0;
}