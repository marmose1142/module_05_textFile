package by.epam.module5.task1;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	private String name;
	private List<TextFile> listTextFile = new ArrayList<>();
	private List<Directory> listDirectory = new ArrayList<>();

	public Directory() {

	}

	public Directory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TextFile> getListTextFile() {
		return listTextFile;
	}

	public void setListTextFile(List<TextFile> listTextFile) {
		this.listTextFile = listTextFile;
	}

	public List<Directory> getListDirectory() {
		return listDirectory;
	}

	public void setListDirectory(List<Directory> listDirectory) {
		this.listDirectory = listDirectory;
	}

	public void addTextFile(TextFile textFile) {
		listTextFile.add(textFile);

	}

	public void addDirectory(Directory directory) {
		listDirectory.add(directory);
	}

	public void removeTextFile(String name) {
		for (int i = 0; i < listTextFile.size(); i++) {
			if (listTextFile.get(i).getName().equalsIgnoreCase(name)) {
				listTextFile.remove(listTextFile.get(i));
			}
		}
	}

	public void removeDirectory(String name) {
		for (int i = 0; i < listDirectory.size(); i++) {
			if (listDirectory.get(i).getName().equalsIgnoreCase(name)) {
				listDirectory.remove(listDirectory.get(i));
			}
		}
	}

	public void renameDirectory(String name, String newname) {
		for (int i = 0; i < listDirectory.size(); i++) {
			if (listDirectory.get(i).getName().equalsIgnoreCase(name)) {
				listDirectory.get(i).setName(newname);
				;
			}
		}
	}

	public void renameFile(String name, String newname) {
		for (int i = 0; i < listTextFile.size(); i++) {
			if (listTextFile.get(i).getName().equalsIgnoreCase(name)) {
				listTextFile.get(i).setName(newname);
			}
		}
	}

	@Override
	public String toString() {
		return "Название директории =" + name;

	}
}
