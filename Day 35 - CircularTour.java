class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	   int t=0,cur=0,st=0;
	   for(int i=0;i<petrol.length;i++){
	       t+=(petrol[i]-distance[i]);
	       cur+=(petrol[i]-distance[i]);
	       if(cur<0){
	           st=i+1;
	           cur=0;
	       }
	   }
	   return (t>0)?st:-1;
    }
}
