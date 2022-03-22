
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[][]= {{1,3,6},{3,8,9},{4,8,6}};//creating two matrix
int arr2[][]= {{4,9,5},{4,2,7},{1,9,5}};


int arr3[][]=new int[3][3];


for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++) {
		arr3[i][j]=arr1[i][j]+arr2[i][j];
		System.out.println(arr3[i][j]+" ");
	}
	System.out.println();
	
}

	}

}
