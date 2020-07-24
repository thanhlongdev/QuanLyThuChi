/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.model.HoaDonThu;
import com.poly.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author THANHLONG
 */
public class HoaDonThuDAO {

    public List<HoaDonThu> getListHoaDonThu() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "FROM HoaDonThu";
        Query query = session.createQuery(hql);
        List<HoaDonThu> list = query.list();
        session.close();
        return list;
    }

    public List<HoaDonThu> getListHoaDonThuByUsername(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "FROM HoaDonThu WHERE username LIKE :username";
        Query query = session.createQuery(hql);
        query.setParameter("username", username);
        List<HoaDonThu> list = query.list();
        session.close();
        return list;
    }

    public HoaDonThu getHoaDonThuById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        HoaDonThu loaiThu = (HoaDonThu) session.get(HoaDonThu.class, id);
        session.close();
        return loaiThu;
    }

    public boolean addHoaDonThu(HoaDonThu hoaDonThu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(hoaDonThu);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public boolean updateHoaDonThu(HoaDonThu hoaDonThu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(hoaDonThu);
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

    public boolean deleteHoaDonThu(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            HoaDonThu hoaDonThu = getHoaDonThuById(id);
            session.beginTransaction();
            session.delete(hoaDonThu);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public HoaDonThu getLastHoaDonThu() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String hql = "From HoaDonThu Order by mahdthu desc";
            Query query = session.createQuery(hql);
            return (HoaDonThu) query.setMaxResults(1).uniqueResult();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return null;
    }
}
