class Solution {
    public String reorganizeString(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
           arr[s.charAt(i)-'a']++;
        }
        int max=0,letter=0;
        for(int i=0;i<26;i++){
            if(arr[i]>max){
                max=arr[i];
                letter=i;
            }
        }
        if(max>(s.length()+1)/2) 
                return "";
        char res[]=new char[s.length()];
        int index=0;
        while(arr[letter]>0){
            res[index]=(char)(letter+'a');
            index+=2;
            arr[letter]--;
        }
        for(int i=0;i<26;i++){
            while(arr[i]>0){
                if(index>=s.length()) index = 1;
                res[index]=(char)(i+'a');
                index+=2;
                arr[i]--;
            }
        }
        return String.valueOf(res);
  }
    
}
