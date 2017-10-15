/*
A task four types of elements: Id, Status, Titles, Details.
A Task is splited in two parts : Head and Body.
Head=(Id,Status).
Body=(Title, Details).
Head is private, Body is public: this is the 'bitch' logical view.
getId(): give the ID of the current task
getStatus(Id), getTitle(Id), getDetails(Id): give the data
upState(Id), downStat(Id): change the status
changeTitle(Id,NewTitle), changeDetails(Id,NewDetails): modify

A task is a HashTable<Id,Array[1=Status,2=Title,3=Details]
The Array is called the CoreTask;

See the TaskManager for manipulating the tasks: Create, I/O, Delete.

*/

class Task {

//Set some variables

	private int Id;
	private String Status;
	public String Title;
	public String Details;

//Main function

	public static void main(String[] args) {
		System.out.println("Entering Task Core System");

//This is Core
	int[] Mytab;
	Mytab = new int[3];
	


//Get out

	System.out.println("Out");
	}
}
