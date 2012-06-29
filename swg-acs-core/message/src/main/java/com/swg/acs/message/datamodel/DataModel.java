/**
 * 
 */
package com.swg.acs.message.datamodel;

import java.util.ArrayList;
import java.util.List;

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
		List<DataModelItem> items = new ArrayList<DataModelItem>();		
		DataModelItem item=head.getNext();
		if(item.hasNext()==true && item.getValue()!=null){			
			if(item.isAliasIdentifier()==true || item.isNumberIdentifier()==true || item.isMultiInstanceIdentifier()==true){
				while(item.hasNext()){
					item=(DataModelItem) item.getNext().getValue();
					items.add(item);
				}
			}			
		}
		
	}
	
	public String fullDesc(){
		StringBuilder builder=new StringBuilder();
		builder.append(head.getValue());
		if(head.hasNext()==true){
			DataModelItem item=head.getNext();
			while(item.hasNext()){
				builder.append(item.getValue());
				item=item.getNext();
			}
		}
		return builder.toString();
	}
}
