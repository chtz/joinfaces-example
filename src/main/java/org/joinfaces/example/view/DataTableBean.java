package org.joinfaces.example.view;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DataTableBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<Car> carsData;
    
    public DataTableBean() {
    	carsData = Arrays.asList(new Car[]{
        		new Car(1,"Foo","Bar",1,2,3.5,5.6),
        		new Car(2,"Foo2","Bar2",21,22,23.5,25.6),
        });
    }

	public List<Car> getCarsData() {
		return carsData;
	}

	public void setCarsData(List<Car> carsData) {
		this.carsData = carsData;
	}
}
