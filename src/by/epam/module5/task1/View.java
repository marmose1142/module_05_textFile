package by.epam.module5.task1;

public class View {

	public void printDirectory(Directory directory) {

		for (int i = 0; i < directory.getListDirectory().size(); i++) {
			System.out.println(directory.getListDirectory().get(i));
		}

		for (int i = 0; i < directory.getListTextFile().size(); i++) {
			System.out.println("Название файла: " + directory.getListTextFile().get(i).getName());
			System.out.println(directory.getListTextFile().get(i));
		}
	}
}
