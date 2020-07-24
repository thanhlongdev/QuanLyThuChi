/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.model.NguoiDung;
import com.poly.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author THANHLONG
 */
public class NguoiDungDAO {

    public List<NguoiDung> getListNguoiDung() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "FROM NguoiDung";
        Query query = session.createQuery(hql);
        List<NguoiDung> list = query.list();
        session.close();
        return list;
    }

    public NguoiDung getInfoNguoiDung(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        NguoiDung nguoiDung = (NguoiDung) session.get(NguoiDung.class, username);
        session.close();
        return nguoiDung;
    }

    public boolean addNguoiDung(NguoiDung nguoiDung) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(nguoiDung);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public boolean updateNguoiDung(NguoiDung nguoiDung) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(nguoiDung);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public boolean deleteNguoiDung(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            NguoiDung nguoiDung = getInfoNguoiDung(username);
            session.beginTransaction();
            session.delete(nguoiDung);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public boolean checkPrimaryKey(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            if (getInfoNguoiDung(username) != null) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return false;
    }
}
