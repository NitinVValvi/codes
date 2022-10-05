package com.criatosoft.hospitalmanagement.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.criatosoft.hospitalmanagement.model.Department;
import com.criatosoft.hospitalmanagement.model.Doctor;
import com.criatosoft.hospitalmanagement.model.Hospital;
import com.criatosoft.hospitalmanagement.model.Patient;
import com.criatosoft.hospitalmanagement.service.Sancheti;

public class ShivajiNagar implements Sancheti {
	List<Hospital> hlist=new ArrayList<>();
	List<Department> dlist=new ArrayList<>();
	List<Doctor> doclist=new ArrayList<>();
	List<Patient> plist=new ArrayList<>();
	int count=0;
	int count1=0;
	int count2=0;
	int count3=0;
	@Override
	public void addHospital() {
		Scanner sc = new Scanner(System.in);
		Hospital h = new Hospital();
		System.out.println("Enter the Hospital Id: ");
		int hid = sc.nextInt();
		h.setHid(hid);
		System.out.println("Enter the Hospital Name: ");
		String hname = sc.next();
		h.setHname(hname);
		System.out.println("Enter the phone no.");
		long phoneno = sc.nextLong();
		h.setPhoneno(phoneno);
		System.out.println("Enter the location");
		String location = sc.next();
		h.setLocation(location);
		hlist.add(h);
		count++;
	}
	@Override
	public void viewHospital() {
		if(count > 0)
		{
			Iterator<Hospital> itr = hlist.iterator();
			while(itr.hasNext())
			{
				Hospital h = itr.next();
				System.out.println("Hospital details ");
				System.out.println("Hospital-ID\t" +"|"+ "Hospital-Name\t" + "|"+ "Hospital-Phonenumber\t" +"|"+ "Hospital-Location " );
				System.out.println(+h.getHid()+ "     \t " +h.getHname()+"   \t "+h.getPhoneno()+"        \t "+h.getLocation());
			}
			System.out.println("__________________________________________");

		}
		else
		{
			System.out.println("Hospital not found");
		}
	}
	@Override
	public void addDepartment() {
		Scanner sc = new Scanner(System.in);
		Department dp = new Department();
		//System.out.println("Enter the no of department");
		//int no = sc.nextInt();
		
		//for(int i = 1; i<=no;i++)
		//{
			System.out.println("Enter the department id: ");
			int dpid = sc.nextInt();
			dp.setDid(dpid);
			System.out.println("Enter the Department name: ");
			String dpname = sc.next();
			dp.setDname(dpname);
			System.out.println("Enter Hospital id ");
			int hid = sc.nextInt();
			
			Iterator<Hospital> itr = hlist.iterator();
			while(itr.hasNext())
			{
				Hospital h = itr.next();// hid, hname,phoneno,location;
				
				if(hid == h.getHid())
				{
					dp.setHospital(h);;
					dlist.add(dp);
					count1++;
				}
			}
			
		//}
	}
	@Override
	public void viewDepartment() {
		if(count1 > 0)
		{
			Iterator<Department> itr = dlist.iterator();
			
			
			while(itr.hasNext())
			{
				Department dp = itr.next();
			
				System.out.println("Department id: " +dp.getDid());
				System.out.println("Department name: "+dp.getDname());
				System.out.println("Hospital id of department: "+dp.getHospital().getHid());
				System.out.println("Hospital name of department: "+dp.getHospital().getHname());
				System.out.println("Hospital location:" +dp.getHospital().getLocation());
				System.out.println("Hospital phone: "+dp.getHospital().getPhoneno());
			}
			System.out.println("__________________________________________");

		}
		
	}
	@Override
	public void addDoctor() {
		Scanner sc = new Scanner(System.in);
		Doctor doc = new Doctor();
		System.out.println("Enter the doctor id: ");
		int d_id = sc.nextInt();
		doc.setD_id(d_id);
		
		System.out.println("Enter the doctor name: ");
		String d_name = sc.next();
		doc.setD_name(d_name);
		
		System.out.println("Enter the speciality: ");
		String spl = sc.next();
		doc.setSpecialist(spl);
		
		System.out.println("Enter the fees: ");
		int fees = sc.nextInt();
		doc.setFees(fees);
		
		System.out.println("Enter the salary: ");
		double sal = sc.nextDouble();
		doc.setSalary(sal);
		
		System.out.println("Enter the department id: ");
		int did = sc.nextInt();
		
		Iterator<Department> itr = dlist.iterator();
		
		while(itr.hasNext())
		{
			Department d = itr.next();
			if(did == d.getDid())
			{
				doc.setDeparment(d);
			}
			doclist.add(doc);
			count2++;
			
		}
				
	}
	@Override
	public void viewDoctor() {
		Iterator<Doctor> itr = doclist.iterator();
		if(count2>0)
		{
			while(itr.hasNext())
			{
				Doctor doc = itr.next();
				System.out.println("Doctor id: "+doc.getD_id());
				System.out.println("Doctor name: "+doc.getD_name());
				System.out.println("Doctor speciality: "+doc.getSpecialist());
				System.out.println("Doctor fees: "+doc.getFees());
				System.out.println("Doctor salary: "+doc.getSalary());
				System.out.println("Doctor department: "+doc.getDeparment().getDid());
				System.out.println("Doctor department name: "+doc.getDeparment().getDname());
				System.out.println("Doctor hospital name: "+doc.getDeparment().getHospital().getHname());
			}
			System.out.println("__________________________________________");
		}
	}
	@Override
	public void addPatient() {
		Scanner sc = new Scanner(System.in);
		Patient p = new Patient();
		System.out.println("Enter the patient id:" );
		int p_id = sc.nextInt();
		p.setP_id(p_id);
		
		System.out.println("Enter the patient name: ");
		String p_name = sc.next();
		p.setP_name(p_name);
		
		System.out.println("Enter the patient mobile number: ");
		long mobno = sc.nextLong();
		p.setMobileno(mobno);
		
		System.out.println("Enter the Doctor id: ");
		int docid = sc.nextInt();
		
		Iterator<Doctor> itr = doclist.iterator();
		while(itr.hasNext())
		{
			Doctor doc = itr.next();
			if(docid == doc.getD_id())
			{
				p.setDoctor(doc);
				plist.add(p);
				count3++;
				
			}
		}
		
	}
	@Override
	public void viewPatient() {
		Iterator<Patient> itr = plist.iterator();
		if(count3>0)
		{
			while(itr.hasNext())
			{
				Patient p = itr.next();
				System.out.println("Patient id: "+p.getP_id());
				System.out.println("Patient name:"+p.getP_name());
				System.out.println("Patient mobile number: "+p.getMobileno());
				System.out.println("Patient doctor id:  "+p.getDoctor().getD_id());
				System.out.println("Patient doctor name: "+p.getDoctor().getD_name());
				System.out.println("Hospital Name: "+p.getDoctor().getDeparment().getHospital().getHname());
				System.out.println("Hospital Doctor name"+p.getDoctor().getD_name());
				System.out.println("Doctor department:"+p.getDoctor().getDeparment().getDname());
				System.out.println("Doctos speciality: "+p.getDoctor().getSpecialist());
			}
			System.out.println("__________________________________________");
		}
	}

}
