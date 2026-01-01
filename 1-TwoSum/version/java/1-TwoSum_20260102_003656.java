// Last updated: 02/01/2026, 00:36:56
while (!dq.isEmpty() && dq.peekFirst() != nums[i]) {
    dq.pollFirst();
}
if (!dq.isEmpty()) {
    dq.pollFirst(); // Remove the duplicate
}