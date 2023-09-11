/*
* AMRIT – Accessible Medical Records via Integrated Technology 
* Integrated EHR (Electronic Health Records) Solution 
*
* Copyright (C) "Piramal Swasthya Management and Research Institute" 
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.wipro.fhir.data.mongo.care_context;

import java.util.ArrayList;

public class CareContextPatient {

	String referenceNumber;
	String display;
	ArrayList<CareContextDetials> careContexts;
	
	public String getReferencenumber() {
		return referenceNumber;
	}
	public void setReferencenumber(String referencenumber) {
		this.referenceNumber = referencenumber;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public ArrayList<CareContextDetials> getCarecontexts() {
		return careContexts;
	}
	public void setCarecontexts(ArrayList<CareContextDetials> carecontexts) {
		this.careContexts = carecontexts;
	}
}