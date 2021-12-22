#include<stdio.h>
#include<string.h>
struct input
{
    char name[10];
    int at,bt,ct,tbt;
}
tab[5];
struct sequence
{
    char name[10];
    int start,end;
}
seq[100],seq1[20];
int finish,time,n,k,prev;
void getinput()
{
    int i;
    system("clear");
    printf("\nEnter number of processes: ");
    scanf("%d",&n);
    for (i=0;i<n;i++)
    {
        printf("\nEnter process name: ");
        scanf("%s",tab[i].name);
        printf("\nBurst time: ");
        scanf("%d",&tab[i].bt);
        printf("\nArrival time: ");
        scanf("%d",&tab[i].at);
        tab[i].tbt=tab[i].bt;
    }
}
void printinput()
{
    int i;
    printf("\n\nProcess\tbt\tat");
    for(i=0;i<n;i++)
    {
        printf("\n%s\t%d\t%d",tab[i].name,tab[i].tbt,tab[i].at);
    }
}
void bubble()
{
    struct input t;
    int i,j;
    for(i=0;i<n;i++)
    for(j=0;j<(n-1)-i;j++)
    if(tab[j].at>tab[j+1].at)
    {
        t=tab[j];
        tab[j]=tab[j+1];
        tab[j+1]=t;
    }
}
void printoutput()
{
    int i;
    float atat=0,awt=0;
    printf("\n##############_FINAL_TABLE_#############");
    printf("\n\nProcess\tat\tbt\tct\ttat\twt");
    for(i=0;i<n;i++)
    {
    printf("\n\n%s\t%d\t%d\t%d\t%d\t%d",tab[i].name,tab[i].at,tab[i].bt,tab[i].ct,
    tab[i].ct-tab[i].at,tab[i].ct-tab[i].at-tab[i].bt);
    atat+=tab[i].ct-tab[i].at;
    awt+=tab[i].ct-tab[i].at-tab[i].bt;
    }
    atat /=n;
    awt /=n;
    printf("\n\nAverage TAT=%f",atat);
    printf("\n\nAverage WT=%f",awt);
}
void processinput()
{
    int i,j;
    finish=k=0;
    for(i=0;i<n;i++)
  {
    for(j=0;j<tab[i].bt;j++)
    {
        time++;
        tab[i].tbt--;
        tab[i].ct=time;
        printinput();
        seq[k].start=prev;
        seq[k].end=time;
        strcpy(seq[k++].name,tab[i].name);
        prev=time;
    }
  }
}
void ganttchart()
{
    int i=0;
    printf("\n\n###########_GANTT_CHART_###########");
    for(i=0;i<k;i++){
        printf(" |%d_%s_%d ",seq[i].start,seq[i].name,seq[i].end);
    }
}
int main()
{
    int i;
    getinput();
    printf("\n\nEnter Data");
    printinput();
    bubble();
    printf("\nData after sorting according arival time");
    printinput();
    printoutput();
    ganttchart();
return (0);
}
