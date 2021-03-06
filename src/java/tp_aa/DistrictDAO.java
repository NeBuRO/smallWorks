/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package tp_aa;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class DistrictDAO {
	public static District loadDistrictByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return loadDistrictByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District getDistrictByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return getDistrictByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return loadDistrictByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District getDistrictByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return getDistrictByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (District) session.load(tp_aa.District.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District getDistrictByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (District) session.get(tp_aa.District.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (District) session.load(tp_aa.District.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District getDistrictByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (District) session.get(tp_aa.District.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDistrict(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return queryDistrict(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDistrict(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return queryDistrict(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District[] listDistrictByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return listDistrictByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District[] listDistrictByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return listDistrictByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDistrict(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.District as District");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDistrict(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.District as District");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("District", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District[] listDistrictByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDistrict(session, condition, orderBy);
			return (District[]) list.toArray(new District[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District[] listDistrictByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDistrict(session, condition, orderBy, lockMode);
			return (District[]) list.toArray(new District[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return loadDistrictByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return loadDistrictByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		District[] districts = listDistrictByQuery(session, condition, orderBy);
		if (districts != null && districts.length > 0)
			return districts[0];
		else
			return null;
	}
	
	public static District loadDistrictByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		District[] districts = listDistrictByQuery(session, condition, orderBy, lockMode);
		if (districts != null && districts.length > 0)
			return districts[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDistrictByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return iterateDistrictByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDistrictByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return iterateDistrictByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDistrictByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.District as District");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDistrictByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.District as District");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("District", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District createDistrict() {
		return new tp_aa.District();
	}
	
	public static boolean save(tp_aa.District district) throws PersistentException {
		try {
			globalconf.TPAAPersistentManager.instance().saveObject(district);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tp_aa.District district) throws PersistentException {
		try {
			globalconf.TPAAPersistentManager.instance().deleteObject(district);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(tp_aa.District district) throws PersistentException {
		try {
			globalconf.TPAAPersistentManager.instance().getSession().refresh(district);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tp_aa.District district) throws PersistentException {
		try {
			globalconf.TPAAPersistentManager.instance().getSession().evict(district);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByCriteria(DistrictCriteria districtCriteria) {
		District[] districts = listDistrictByCriteria(districtCriteria);
		if(districts == null || districts.length == 0) {
			return null;
		}
		return districts[0];
	}
	
	public static District[] listDistrictByCriteria(DistrictCriteria districtCriteria) {
		return districtCriteria.listDistrict();
	}
}
