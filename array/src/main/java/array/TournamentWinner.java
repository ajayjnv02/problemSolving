package array;

import java.util.*;

class TournamentWinner {
	public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < competitions.size(); i++) {
			ArrayList<String> competition = competitions.get(i);
			if (results.get(i) == 0) {
				if (map.get(competition.get(1)) == null) {
					map.put(competition.get(1), 3);
				} else {
					int point = map.get(competition.get(1));
					map.put(competition.get(1), point + 3);
				}

			} else {
				if (map.get(competition.get(0)) == null) {
					map.put(competition.get(0), 3);
				} else {
					int point = map.get(competition.get(0));
					map.put(competition.get(0), point + 3);
				}

			}
		}
		return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

		
	}

	
}
