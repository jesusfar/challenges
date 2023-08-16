package clouds

const (
	oneStep  int32 = 1
	twoSteps int32 = 2
)

func jumpingOnClouds(c []int32) int32 {
	var (
		nextIndex int32 = 0
		steps     int32 = 0
		lastIndex int32 = int32(len(c)) - 1
		jump      int32 = 0
	)

	for {
		if nextIndex+twoSteps <= lastIndex && c[nextIndex+twoSteps] != 1 {
			jump = twoSteps
		} else if nextIndex+oneStep <= lastIndex && c[nextIndex+oneStep] != 1 {
			jump = oneStep
		} else {
			break
		}
		nextIndex += jump
		steps++
	}

	return steps
}
