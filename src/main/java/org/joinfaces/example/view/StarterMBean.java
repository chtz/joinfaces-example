package org.joinfaces.example.view;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class StarterMBean implements Serializable {
	private static final long serialVersionUID = 1L;

	public String getStarter() {
		return "starter";
	}
}
