/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.model.ChiTietThu;
import com.poly.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author THANHLONG
 */
public class ChiTietThuDAO {

    public List<ChiTietThu> getListChiTietThu() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "FROM ChiTietThu";
        Query query = session.createQuery(hql);
        List<ChiTietThu> list = query.list();
        session.close();
        return list;
    }

    public boolean addChiTietThu(ChiTietThu chiTietThu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(chiTietThu);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public boolean updateChiTietThu(ChiTietThu chiTietThu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(chiTietThu);
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

    public boolean deleteChiTietThuByMaHD(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String sql = "delete from ChiTietThu where mahdthu = " + id;
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

    public List<ChiTietThu> findByMaHD(int mahd) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "From ChiTietThu Where mahdthu = :mahd";
        Query query = session.createQuery(hql);
        query.setParameter("mahd", mahd);
        List<ChiTietThu> list = query.list();
        session.close();
        return list;
    }
}
