class IyteMutableList{
  var addingMutableList:Array[Int] =new Array[Int](0)

  def add(x: Int): Array[Int] ={
    val template = Array(x)
    addingMutableList = Array.concat(addingMutableList,template)
    return addingMutableList
  }

  override def toString(): String = {
	var resultofString =""
	for(i<-0 to addingMutableList .length){
		   resultofString = resultofString.concat("," +  addingMutableList(i))
   }
   return resultofString
  }
}


object IyteMutableList extends IyteMutableList{
  def apply = new IyteMutableList()
}
