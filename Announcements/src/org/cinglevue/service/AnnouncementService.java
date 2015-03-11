package org.cinglevue.service;

import java.util.List;

import org.cinglevue.announcement.Announcement;

// service layer interface created in order to interact with database layer   to perform CRUD operation
public interface AnnouncementService {
	public void addAnnouncement(Announcement announcement);

	public void updateAnnouncement(Announcement announcement);

	public Announcement getAnnouncement(String id);

	public void deleteAnnouncement(String id);

	public List<Announcement> getAnnouncement();

}
