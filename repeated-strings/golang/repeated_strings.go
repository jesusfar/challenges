package golang

import "strings"

func repeatedString(s string, n int64) int64 {
	l := int64(len(s))
	r := n / l
	a := int64(strings.Count(s, "a"))
	t := r * a

	if c := n % l; c > 0 {
		ss := s[:c]
		t += int64(strings.Count(ss, "a"))
	}

	return t
}
