package com.swg.acs.message.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Puradidjaja
 * 
 */
public class DataModelItemImpl implements DataModelItem {

	public DataModelItem getNext() {
		// TODO Auto-generated method stub
		DataModel model = new DataModel();
		if (model.getHead().hasNext()==true) {
			model = (DataModel) model.getHead().getNext();
		}
		return model.getHead().getNext();
	}
	
	public Object getValue() {
		// TODO Auto-generated method stub
		DataModel model = new DataModel();
		if(model.getHead().hasNext()==true && model.getTail() != null){
			model = (DataModel) model.getTail().getValue();
		}
		return model.getTail().getValue();
	}

	public boolean isNumberIdentifier() {
		// TODO Auto-generated method stub
		List<DataModel> models = new ArrayList<DataModel>();
		for (DataModel model:models) {
			if (model.getHead().hasNext()==true) {
				return true;
			}
		}
		return false;
	}

	public boolean isAliasIdentifier() {
		// TODO Auto-generated method stub
		List<DataModel> models = new ArrayList<DataModel>();
		for (DataModel model:models) {
			if (model.getHead().hasNext()==true) {
				return true;
			}
		}
		return false;
	}

	public boolean isMultiInstanceIdentifier() {
		// TODO Auto-generated method stub
		List<DataModel> models = new ArrayList<DataModel>();
		for (DataModel model : models) {
			if (model.getHead().isNumberIdentifier() == true && model.getHead().isAliasIdentifier()==true) {
				return true;
			}
		}
		return false;
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		List<DataModel> models = new ArrayList<DataModel>();
		for (DataModel model : models) {
			if (model.getHead().getNext() != null) {
				return true;
			}
		}
		return false;
	}

}
