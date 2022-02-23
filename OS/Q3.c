/* Write a program that demonstrates the use of nice () system call. After a
child process is started using fork (), assign higher priority to the child
using nice () system call. */

#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
int main()
{
  pid_t p;
  printf("before fork\n");
  p = fork();
  if (p == 0)
  {
    printf("I am child having id %d\n", getpid());
    printf("My parent's id is %d\n", getppid());
  }
  else
  {
    printf("My child's id is %d\n", p);
    printf("I am parent having id %d\n", getpid());
  }
  printf("Common\n");
}