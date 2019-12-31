package com.nodb.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nodb.entity.ClassRoom;

@Service
public class ClassRoomService {
	
	private List<ClassRoom> classRooms = new ArrayList<>(Arrays.asList(
			new ClassRoom("N001", "ROOM A", "SOUTH"),
			new ClassRoom("N002", "ROOM B", "SOUTH")
			));
	
	

	public List<ClassRoom> getAllClassRooms() {
		return classRooms;
	}

	public ClassRoom getAllClassRoomByNo(String no) {
				return classRooms.stream().filter(t->t.getNo().equalsIgnoreCase(no)).findFirst().get();
	}

	public void addClassRoom(ClassRoom classRoom) {
		classRooms.add(classRoom);
	}

	public void updateClassRoom(ClassRoom classRoom, String no) {
		for(int i=0; i<classRooms.size(); i++) {
			ClassRoom c = classRooms.get(i);
			if(c.getNo().equals(no)) {
				classRooms.set(i, classRoom);
				return;
			}
		}

		
	}

	public void deleteClassRoom(String no) {
		classRooms.removeIf(t->t.getNo().equals(no));
		
	}
	

}
