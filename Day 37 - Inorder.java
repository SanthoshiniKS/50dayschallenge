class Solution {
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        traverse(arr,root);
        return arr;
    }
    static void traverse(ArrayList<Integer> arr, Node node)
    {
        if(node==null)
           return;
        traverse(arr,node.left);
        arr.add(node.data);
        traverse(arr,node.right);
    }
}
