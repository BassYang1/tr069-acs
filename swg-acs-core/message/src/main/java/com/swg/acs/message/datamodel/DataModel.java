/**
 * 
 */
package com.swg.acs.message.datamodel;

/**
 * @author satriaprayoga
 *
 */
public class DataModel {

	private DataModelItem head;
	private DataModelItem tail;
	
	public DataModelItem getHead() {
		return head;
	}
	
	public DataModelItem getTail() {
		return tail;
	}
	
	public void add(Object value){
		//TODO:masukkan datamodel
	}
	
	public String fullDesc(){
		StringBuilder builder=new StringBuilder();
		builder.append(head.getValue());
		if(head.hasNext()){
			DataModelItem item=head.getNext();
			while(item.hasNext()){
				builder.append(item.getValue());
				item=item.getNext();
			}
		}
		return builder.toString();
	}
}
