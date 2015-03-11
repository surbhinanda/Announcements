package org.cinglevue.controller;

import java.util.List;

import org.cinglevue.announcement.Announcement;
import org.cinglevue.service.AnnouncementService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class AnnouncementController {

	private AnnouncementService announcementService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addAnnouncementPage() {
		ModelAndView modelAndView = new ModelAndView("add-announcement-form");
		modelAndView.addObject("announcement", new Announcement());
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addingAnnouncement(
			@ModelAttribute Announcement announcement) {

		ModelAndView modelAndView = new ModelAndView("home");
		announcementService.addAnnouncement(announcement);

		String message = "Announcement was successfully added.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	// list all announcements
	@RequestMapping(value = "/list")
	public ModelAndView listOfAnnouncements() {
		ModelAndView modelAndView = new ModelAndView("list-of-announcements");

		List<Announcement> announcements = announcementService
				.getAnnouncement();
		modelAndView.addObject("announcements", announcements);

		return modelAndView;
	}

	// edit announcements based on id
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editAnnoucementPage(@PathVariable String id) {
		ModelAndView modelAndView = new ModelAndView("edit-announcement-form");
		Announcement announcement = announcementService.getAnnouncement(id);
		modelAndView.addObject("announcement", announcement);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView edditingAnnouncement(
			@ModelAttribute Announcement announcement, @PathVariable String id) {

		ModelAndView modelAndView = new ModelAndView("home");

		announcementService.updateAnnouncement(announcement);

		String message = "Announcemnet was successfully edited.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}
// delete announcements
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteAnnouncement(@PathVariable String id) {
		ModelAndView modelAndView = new ModelAndView("home");
		announcementService.deleteAnnouncement(id);
		String message = "Announcement was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}




