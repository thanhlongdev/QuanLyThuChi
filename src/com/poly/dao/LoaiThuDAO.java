/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.model.LoaiThu;
import com.poly.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author THANHLONG
 */
public class LoaiThuDAO {

    public List<LoaiThu> getListLoaiThu() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "FROM LoaiThu";
        Query query = session.createQuery(hql);
        List<LoaiThu> list = query.list();
        session.close();
        return list;
    }

    public LoaiThu getLoaiThu(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        LoaiThu loaiThu = (LoaiThu) session.get(LoaiThu.class, id);
        session.close();
        return loaiThu;
    }

    public boolean addLoaiThu(LoaiThu loaiThu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(loaiThu);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public boolean updateLoaiThu(LoaiThu loaiThu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(loaiThu);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public boolean deleteLoaiThu(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            LoaiThu loaiThu = getLoaiThu(id);
            session.beginTransaction();
            session.delete(loaiThu);
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
