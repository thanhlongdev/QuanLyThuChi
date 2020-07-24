/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author THANHLONG
 */
public class ThongKeDAO {

    public Object sp_getTotalChi(int day, int month, int year) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String sql = "exec sp_getTotalChiByDay :day, :month, :year";
        Query query;
        if (month == 0 && day == 0) {
            sql = "exec sp_getTotalChiByYear :year";
            query = session.createSQLQuery(sql);
            query.setParameter("year", year);
        } else if (day == 0) {
            sql = "exec sp_getTotalChiByMonth :month, :year";
            query = session.createSQLQuery(sql);
            query.setParameter("month", month);
            query.setParameter("year", year);
        } else {
            query = session.createSQLQuery(sql);
            query.setParameter("day", day);
            query.setParameter("month", month);
            query.setParameter("year", year);
        }
        List<Object> list = query.list();
        session.close();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    public Object sp_getTotalThu(int day, int month, int year) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String sql = "exec sp_getTotalThuByDay :day, :month, :year";
        Query query;
        if (month == 0 && day == 0) {
            sql = "exec sp_getTotalThuByYear :year";
            query = session.createSQLQuery(sql);
            query.setParameter("year", year);
        } else if (day == 0) {
            sql = "exec sp_getTotalThuByMonth :month, :year";
            query = session.createSQLQuery(sql);
            query.setParameter("month", month);
            query.setParameter("year", year);
        } else {
            query = session.createSQLQuery(sql);
            query.setParameter("day", day);
            query.setParameter("month", month);
            query.setParameter("year", year);
        }
        List<Object> list = query.list();
        session.close();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    public Object sp_getUserChi(int day, int month, int year) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String sql = "exec sp_getUserChiByDay :day, :month, :year";
        Query query;
        if (month == 0 && day == 0) {
            sql = "exec sp_getUserChiByYear :year";
            query = session.createSQLQuery(sql);
            query.setParameter("year", year);
        } else if (day == 0) {
            sql = "exec sp_getUserChiByMonth :month, :year";
            query = session.createSQLQuery(sql);
            query.setParameter("month", month);
            query.setParameter("year", year);
        } else {
            query = session.createSQLQuery(sql);
            query.setParameter("day", day);
            query.setParameter("month", month);
            query.setParameter("year", year);
        }
        List<Object> list = query.list();
        session.close();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }
    
    public Object sp_getUserThu(int day, int month, int year) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String sql = "exec sp_getUserThuByDay :day, :month, :year";
        Query query;
        if (month == 0 && day == 0) {
            sql = "exec sp_getUserThuByYear :year";
            query = session.createSQLQuery(sql);
            query.setParameter("year", year);
        } else if (day == 0) {
            sql = "exec sp_getUserThuByMonth :month, :year";
            query = session.createSQLQuery(sql);
            query.setParameter("month", month);
            query.setParameter("year", year);
        } else {
            query = session.createSQLQuery(sql);
            query.setParameter("day", day);
            query.setParameter("month", month);
            query.setParameter("year", year);
        }
        List<Object> list = query.list();
        session.close();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

}
