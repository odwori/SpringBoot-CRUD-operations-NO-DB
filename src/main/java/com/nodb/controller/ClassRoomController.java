package com.nodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nodb.entity.ClassRoom;
import com.nodb.service.ClassRoomService;

@RestController
public class ClassRoomController {
	
	@Autowired
	private ClassRoomService classRoomService;
	
	@GetMapping("/classrooms")
	public List<ClassRoom> getAllClassRooms() {
		return classRoomService.getAllClassRooms();
	}
	@GetMapping("/classrooms/{no}")
	public ClassRoom getAllClassRooms(@PathVariable String no) {
		return classRoomService.getAllClassRoomByNo(no);
	}
	
	// adding a class room
	@PostMapping("/classrooms")
	public void addClassRoom(@RequestBody ClassRoom classRoom) {
		 classRoomService.addClassRoom(classRoom);
	}
	
	//deleting a class room
	@DeleteMapping("classrooms/{no}")
	public void deleteClassRoom(@PathVariable String no) {
		classRoomService.deleteClassRoom(no);
	}
	
	@PutMapping("classrooms/{no}")
	public void updateClassRoom(@RequestBody ClassRoom classRoom, @PathVariable String no) {
		classRoomService.updateClassRoom(classRoom, no);
	}
	

}
