/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.model.HoaDonChi;
import com.poly.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author THANHLONG
 */
public class HoaDonChiDAO {

    public List<HoaDonChi> getListHoaDonChi() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "FROM HoaDonChi";
        Query query = session.createQuery(hql);
        List<HoaDonChi> list = query.list();
        session.close();
        return list;
    }

    public List<HoaDonChi> getListHoaDonChiByUsername(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "FROM HoaDonChi WHERE username LIKE :username";
        Query query = session.createQuery(hql);
        query.setParameter("username", username);
        List<HoaDonChi> list = query.list();
        session.close();
        return list;
    }

    public HoaDonChi getHoaDonChiById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        HoaDonChi loaiThu = (HoaDonChi) session.get(HoaDonChi.class, id);
        session.close();
        return loaiThu;
    }

    public boolean addHoaDonChi(HoaDonChi hoaDonChi) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(hoaDonChi);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public boolean updateHoaDonChi(HoaDonChi hoaDonChi) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(hoaDonChi);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public boolean deleteHoaDonChi(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            HoaDonChi HoaDonChi = getHoaDonChiById(id);
            session.beginTransaction();
            session.delete(HoaDonChi);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public HoaDonChi getLastHoaDonChi() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String hql = "From HoaDonChi Order by idhdchi desc";
            Query query = session.createQuery(hql);
            return (HoaDonChi) query.setMaxResults(1).uniqueResult();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return null;
    }
}
