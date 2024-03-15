public class binary_search {
    static void binary_Search(int a[],int key){
        int mid,l=0,ub=a.length-1,flag=0;
        while(l<=ub){
            mid=(l+ub)/2;
        if(a[mid]==key){
            flag=1;
            break;
        }
        else if(a[mid]>key){
            l=mid+1;
        }
        else{
            ub=mid-1;
        }}
    
        if(flag==1){
            System.out.println("Yes Found");
        }
        else{
            System.out.println("Not Found");
        }
        
    }
        public static void main(String[] args)  
        {            
            int a[]={1,22,33,44,55};
            binary_Search(a,66);
        
        
    }
}