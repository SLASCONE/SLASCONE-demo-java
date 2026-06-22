package Program;

import java.util.ArrayList;
import java.util.List;

final class ReleaseCheck {
    private ReleaseCheck() {
    }

    static int compareRelease(String left, String right) {
        List<Integer> leftParts = parseRelease(left);
        List<Integer> rightParts = parseRelease(right);

        int max = Math.max(leftParts.size(), rightParts.size());
        for (int i = 0; i < max; i++) {
            int l = i < leftParts.size() ? leftParts.get(i) : 0;
            int r = i < rightParts.size() ? rightParts.get(i) : 0;
            if (l != r) {
                return Integer.compare(l, r);
            }
        }
        return 0;
    }

    private static List<Integer> parseRelease(String release) {
        List<Integer> parts = new ArrayList<>();
        if (release == null || release.isBlank()) {
            return parts;
        }

        String[] tokens = release.split("\\.");
        for (String token : tokens) {
            String digits = token.replaceAll("[^0-9]", "");
            if (digits.isEmpty()) {
                parts.add(0);
                continue;
            }
            try {
                parts.add(Integer.parseInt(digits));
            } catch (NumberFormatException ex) {
                parts.add(0);
            }
        }
        return parts;
    }
}