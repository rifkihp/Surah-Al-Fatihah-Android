package com.app.uas_quran.Model.AyatModel;

import com.google.gson.annotations.SerializedName;

public class Meta{

	@SerializedName("filters")
	private Filters filters;

	public Filters getFilters(){
		return filters;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"filters = '" + filters + '\'' + 
			"}";
		}
}