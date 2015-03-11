package org.cinglevue.dao;

import java.util.List;

import org.cinglevue.announcement.Announcement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AnnouncemenDAOImpl implements AnnouncementDAO {

	@Autowired
	private SessionFactory sessionFactory;

	Announcement announcement;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();

	}

	@Override
	public void updateAnnouncement(Announcement announcement) {
		try {
			Announcement announcementToUpdate = getAnnouncement(announcement
					.getId());
			announcementToUpdate.setTitle(announcement.getTitle());
			announcementToUpdate.setBody(announcement.getBody());

			getCurrentSession().update(announcementToUpdate);
		} catch (Exception ex) {
			System.out.print("exception  while update of announcments" + ex);
		}

	}

	@Override
	public Announcement getAnnouncement(String id) {
		try {
			Announcement announcement = (Announcement) getCurrentSession().get(
					Announcement.class, id);
			return announcement;
		} catch (Exception ex) {
			System.out.print("exception  while getting list of announcments"
					+ ex);
		}
		return announcement;
	}

	@Override
	public void deleteAnnouncement(String id) {
		try {
			Announcement announcement = getAnnouncement(id);
			if (announcement != null)
				getCurrentSession().delete(announcement);
		} catch (Exception ex) {
			System.out
					.print("exception  while deletiobn  of announcments" + ex);
		}

	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<Announcement> getAnnouncement() {

		return getCurrentSession().createQuery("from Announcement").list();

	}

	@Override
	public void addAnnoucement(Announcement announcement) {
		try {
			getCurrentSession().save(announcement);
		} catch (Exception ex) {
			System.out.println("exception  while addition  of announcments"
					+ ex);
		}

	}

}
