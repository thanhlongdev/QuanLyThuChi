/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.model.LoaiChi;
import com.poly.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author THANHLONG
 */
public class LoaiChiDAO {
    public List<LoaiChi> getListLoaiChi() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "FROM LoaiChi";
        Query query = session.createQuery(hql);
        List<LoaiChi> list = query.list();
        session.close();
        return list;
    }

    public LoaiChi getLoaiChi(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        LoaiChi loaiThu = (LoaiChi) session.get(LoaiChi.class, id);
        session.close();
        return loaiThu;
    }

    public boolean addLoaiChi(LoaiChi loaiChi) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(loaiChi);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public boolean updateLoaiChi(LoaiChi loaiChi) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(loaiChi);
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

    public boolean deleteLoaiChi(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            LoaiChi loaiChi = getLoaiChi(id);
            session.beginTransaction();
            session.delete(loaiChi);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }
}
