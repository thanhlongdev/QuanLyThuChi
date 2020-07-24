/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.model.ChiTietChi;
import com.poly.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author THANHLONG
 */
public class ChiTietChiDAO {

    public List<ChiTietChi> getListHoaDonChi() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "FROM ChiTietChi";
        Query query = session.createQuery(hql);
        List<ChiTietChi> list = query.list();
        session.close();
        return list;
    }

    public boolean addChiTietChi(ChiTietChi chiTietChi) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(chiTietChi);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public boolean updateChiTietChi(ChiTietChi chiTietChi) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(chiTietChi);
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

    public boolean deleteChiTietChiByMaHD(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String sql = "delete from ChiTietChi where mahdchi = " + id;
            Query query = session.createSQLQuery(sql);
            query.executeUpdate();
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public List<ChiTietChi> findByMaHD(int mahd) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "From ChiTietChi Where mahdchi = :mahd";
        Query query = session.createQuery(hql);
        query.setParameter("mahd", mahd);
        List<ChiTietChi> list = query.list();
        session.close();
        return list;
    }
}
