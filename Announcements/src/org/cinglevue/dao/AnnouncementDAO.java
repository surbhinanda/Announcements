package org.cinglevue.dao;

import java.util.List;

import org.cinglevue.announcement.Announcement;

//  interface class created for performing CRUD operations for adding, deleting, updating and getting list of all announcements in data base
public interface AnnouncementDAO {

	public void addAnnoucement(Announcement announcement);

	public void updateAnnouncement(Announcement announcement);

	public Announcement getAnnouncement(String id);

	public void deleteAnnouncement(String id);

	public List<Announcement> getAnnouncement();

}
