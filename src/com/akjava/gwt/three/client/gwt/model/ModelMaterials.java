package com.akjava.gwt.three.client.gwt.model;

import com.google.gwt.core.client.JavaScriptObject;

public class ModelMaterials extends JavaScriptObject{
protected ModelMaterials(){}

public native final void setDbgColor (int DbgColor)/*-{
this["DbgColor"]=DbgColor;
}-*/;

public native final void setDbgIndex (int DbgIndex)/*-{
this["DbgIndex"]=DbgIndex;
}-*/;

public native final void setDbgName (String DbgName)/*-{
this["DbgName"]=DbgName;
}-*/;

public native final void setvertexColors (boolean vertexColors)/*-{
this["vertexColors"]=vertexColors;
}-*/;

public final static ModelMaterials createDefault(){
	ModelMaterials m=(ModelMaterials) ModelMaterials.createObject();
	m.setDbgColor(15658734);
	m.setDbgIndex(0);
	m.setDbgName("default");
	m.setvertexColors(false);
	return m;
}

}
