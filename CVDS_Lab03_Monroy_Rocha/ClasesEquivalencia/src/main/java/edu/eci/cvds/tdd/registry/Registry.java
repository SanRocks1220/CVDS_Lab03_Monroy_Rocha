
package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {

	ArrayList<Integer> regIds = new ArrayList<Integer>();

	public RegisterResult registerVoter(Person p) {
		// TODO Validate person and return real result.

		RegisterResult result = RegisterResult.VALID;
		;

		if (!p.isAlive() || (p.getAge() >= 105 && p.getAge() < 120)) {

			result = RegisterResult.DEAD;

		} else if (p.getAge() > 0 && p.getAge() <= 17) {

			result = RegisterResult.UNDERAGE;

		} else if (p.getAge() <= 0 || p.getAge() >= 120) {

			result = RegisterResult.INVALID_AGE;

		} else if (p.getAge() > 17 && p.getAge() < 105) {

			if (regIds.contains(p.getId())) {

				result = RegisterResult.DUPLICATED;

			}
		}

		return result;

	}
}