package org.cinglevue.service;

import java.util.List;

import org.cinglevue.announcement.Announcement;
import org.cinglevue.dao.AnnouncementDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class AnnouncementServiceImpl implements AnnouncementService {

	@Autowired
	private AnnouncementDAO announcementDao;

	@Override
	public void addAnnouncement(Announcement announcement) {
		announcementDao.addAnnoucement(announcement);

	}

	@Override
	public void updateAnnouncement(Announcement announcement) {
		announcementDao.updateAnnouncement(announcement);

	}

	@Override
	public Announcement getAnnouncement(String id) {

		return announcementDao.getAnnouncement(id);

	}

	@Override
	public void deleteAnnouncement(String id) {
		announcementDao.deleteAnnouncement(id);

	}

	@Override
	public List<Announcement> getAnnouncement() {

		return announcementDao.getAnnouncement();
	}

}
