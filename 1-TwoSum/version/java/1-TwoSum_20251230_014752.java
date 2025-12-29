// Last updated: 30/12/2025, 01:47:52
while (!dq.isEmpty() && dq.peekFirst() != nums[i]) {
    dq.pollFirst();
}
if (!dq.isEmpty()) {
    dq.pollFirst(); // Remove the duplicate
}