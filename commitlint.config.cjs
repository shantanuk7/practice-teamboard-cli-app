module.exports = {
  extends: ['@commitlint/config-conventional'],
  rules: {
    // Require a blank line between subject and body
    'body-leading-blank': [2, 'always'],

    // Require non-empty body
    'body-empty': [2, 'never'],
  },
};
